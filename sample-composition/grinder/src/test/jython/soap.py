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
    testNumberMap = {}
    lastNumber = 1

    def __init__(self):
        Velocity.init()

        self.tests = (
            test_service(
                name="OrdersImplService",
                url="http://localhost:8080/orders",
                operations=(
                    ("list", {"maximum": 150}),
                    ("query", {"maximum": 150}),
                    ("close", {"maximum": 150}),
                    ("evaluate", {"maximum": 150}),
                ),
            )
        )

    def __call__(self):
        for inputs, test in self.tests:
            test(pick_random_input(inputs))


## UTILITY FUNCTIONS

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

## TEST BUILDING FUNCTIONS

def test_service(name, url, operations, method=post):
    service_func = lambda **kw: method(url=url, **kw)

    return [
        (
            test_inputs(name + "-" + operation),
            test_spec(name + "-" + operation, func=service_func, **options)
        )
        for (operation, options) in operations
    ]

def test_inputs(test_name):
    inputs_file = File(INPUTS_DIR, test_name + ".vm")
    return build_velocity_context(inputs_file)

def test_spec(test_name, func, maximum=None):
    def wrapper(ctx):
        response = func(
            context=ctx,
            logString=test_name,
            template=test_name + ".vm"
        )
        stats = grinder.statistics.getForCurrentTest()
        if maximum and stats.time > maximum:
            stats.success = 0

    if test_name in TestRunner.testNumberMap:
        number = TestRunner.testNumberMap[test_name]
    else:
        number = TestRunner.testNumberMap[test_name] = TestRunner.lastNumber
        TestRunner.lastNumber += 1

    return Test(number, test_name).wrap(wrapper)
