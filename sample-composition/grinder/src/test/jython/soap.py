from net.grinder.script.Grinder import grinder
from net.grinder.script         import Test
from net.grinder.plugin.http    import HTTPRequest

from org.apache.velocity.app import Velocity
from org.apache.velocity import VelocityContext

from java.io import StringWriter, FileInputStream, File


## CONFIGURATION AREA


TEMPLATE_DIR = "src/test/velocity"


## TEST BODY


class TestRunner:
    def __init__(self):
        self.listOrdersCtx = VelocityContext()

    def __call__(self):
        Velocity.init()

        listOrdersTest = Test(1, "listOrders").wrap(
            successful_before(
                lambda : post(
                    "http://localhost:8080/orders",
                    self.listOrdersCtx, "listOrders", "listOrders.vm"
                ),
                maximum = 150
            )
        )

        listOrdersTest()


## UTILITY FUNCTIONS

def successful_before(func, maximum):
    def wrapper():
        response = func()
        stats = grinder.statistics.getForCurrentTest()
        if stats.time > maximum or response.statusCode != 200:
            stats.success = 0
    return wrapper

def post(url, context, logString, template):
    return HTTPRequest().POST(
        url,
        render(context, logString, template)
    )

def render(context, logString, template):
    sWriter = StringWriter()
    fIS = None
    try:
        fIS = FileInputStream(File(TEMPLATE_DIR, template))
        Velocity.evaluate(context, sWriter, logString, fIS)
        return sWriter.toString()
    finally:
        if fIS:
            fIS.close()
