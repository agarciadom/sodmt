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
    def __call__(self):
        Velocity.init()

        def invoke():
            response = HTTPRequest().POST(
                "http://localhost:8080/orders",
                render(VelocityContext(), "ListOrders", "listOrders.vm"))

            stats = grinder.statistics.getForCurrentTest()
            if stats.time > 150 or response.statusCode != 200:
                stats.success = 0

        test = Test(1, "Query order by ID").wrap(invoke)
        test()

## UTILITY FUNCTIONS

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
