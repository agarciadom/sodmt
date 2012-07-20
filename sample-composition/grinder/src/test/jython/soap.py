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
    lastNumber = 1

    def __init__(self):
        Velocity.init()

        self.tests = (
            (
                VelocityContext(),
                successful_before(
                    "listOrders",
                    lambda **kw: post(url="http://localhost:8080/orders", **kw),
                    maximum = 150
                )
            ),
        )

    def __call__(self):
        for inputs, test in self.tests:
            test(pick_random_input(inputs))


## UTILITY FUNCTIONS

def successful_before(name, func, maximum):
    def wrapper(ctx):
        response = func(context=ctx, logString=name, template=name + ".vm")
        stats = grinder.statistics.getForCurrentTest()
        if stats.time > maximum or response.statusCode != 200:
            stats.success = 0

    test = Test(TestRunner.lastNumber, name).wrap(wrapper)
    TestRunner.lastNumber += 1
    return test

def pick_random_input(inputsCtx):
    return inputsCtx

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
