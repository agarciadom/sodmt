from net.grinder.script.Grinder import grinder
from net.grinder.script         import Test
from net.grinder.plugin.http    import HTTPRequest

from org.apache.velocity.app import Velocity
from org.apache.velocity import VelocityContext

from java.io import StringWriter, FileInputStream, File


## CONFIGURATION AREA

TEMPLATE_DIR = "src/test/velocity"

MSGTEMPLATE_DIR = TEMPLATE_DIR + "/messages"

MSGTEMPLATE_PREFIX = "\n".join((
    "<soapenv:Envelope\n",
    "  xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n",
    "  <soapenv:Header/>\n",
    "  <soapenv:Body>"
))

MSGTEMPLATE_SUFFIX = "\n".join((
    "",
    "  </soapenv:Body>",
    "</soapenv:Envelope>"
))

INPUTS_DIR = TEMPLATE_DIR + "/inputs"

## TEST BODY

class TestRunner:
    lastNumber = 1

    def __init__(self):
        Velocity.init()

        self.tests = (
            successful_before(
                "OrdersImplService-list",
                lambda **kw: post(url="http://localhost:8080/orders", **kw),
                maximum = 150
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

    inputs = build_velocity_context(File(INPUTS_DIR, name + ".vm"))
    test = Test(TestRunner.lastNumber, name).wrap(wrapper)
    TestRunner.lastNumber += 1

    return (inputs, test)

def build_velocity_context(template_file):
    inputs = VelocityContext()
    fInputs = None
    try:
        fInputs = FileInputStream(template_file)
        Velocity.evaluate(inputs, StringWriter(), "inputs", fInputs)
        return inputs
    finally:
        if fInputs:
            fInputs.close()

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
        sWriter.append(MSGTEMPLATE_PREFIX)
        fIS = FileInputStream(File(MSGTEMPLATE_DIR, template))
        Velocity.evaluate(context, sWriter, logString, fIS)
        sWriter.append(MSGTEMPLATE_SUFFIX)
        return sWriter.toString()
    finally:
        if fIS:
            fIS.close()
