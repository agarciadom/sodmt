from net.grinder.script.Grinder import grinder
from net.grinder.script         import Test
from net.grinder.plugin.http    import HTTPRequest

from org.apache.velocity.app import Velocity
from org.apache.velocity import VelocityContext

from java.io import StringWriter, FileInputStream, File

from java.util import Random

## CONFIGURATION AREA

TEMPLATE_DIR = "src/test/velocity"

MSGTEMPLATE_DIR = TEMPLATE_DIR + "/messages"

MSGTEMPLATE_PREFIX = "\n".join((
    "<soapenv:Envelope",
    "  xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">",
    "  <soapenv:Header/>",
    "  <soapenv:Body>"
))

MSGTEMPLATE_SUFFIX = "\n".join((
    "",
    "  </soapenv:Body>",
    "</soapenv:Envelope>"
))

INPUTS_DIR = TEMPLATE_DIR + "/inputs"

PRNG = Random()

## TEST BODY

class TestRunner:
    nameNumberMap = {}
    lastNumber = 1

    def __init__(self):
        Velocity.init()

        self.tests = (
            successful_before(
                "OrdersImplService-list",
                lambda **kw: post(url="http://localhost:8080/orders", **kw),
                maximum = 150
            ),
            successful_before(
                "OrdersImplService-query",
                lambda **kw: post(url="http://localhost:8080/orders", **kw),
                maximum = 150
            ),
            successful_before(
                "OrdersImplService-close",
                lambda **kw: post(url="http://localhost:8080/orders", **kw),
                maximum = 150
            ),
            successful_before(
                "OrdersImplService-evaluate",
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
    if name in TestRunner.nameNumberMap:
        number = TestRunner.nameNumberMap[name]
    else:
        number = TestRunner.nameNumberMap[name] = TestRunner.lastNumber
        TestRunner.lastNumber += 1

    test = Test(TestRunner.lastNumber, name).wrap(wrapper)

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
    """Picks a random set of inputs from a Velocity context. All
    variables containing a collection are supposed to have the same
    number of elements on their outermost dimension. This function
    will pick a random position and select the items in every variable
    at that position. Variables without collections in them will be
    reused as is."""
    random_ctx = VelocityContext()

    n_tests = None
    i_test = None
    for key in inputsCtx.getKeys():
        value = inputsCtx.get(key)
        try:
            if n_tests is None:
                n_tests = value.size()
                i_test = PRNG.nextInt(n_tests)

            if n_tests > 0:
                value = value.get(i_test)
        except NoSuchMethodException:
            pass

        random_ctx.put(key, value)

    return random_ctx

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
