from net.grinder.script.Grinder import grinder
from net.grinder.script         import Test
from net.grinder.plugin.http    import HTTPRequest

from org.apache.velocity.app import Velocity
from org.apache.velocity import VelocityContext

from java.io import StringWriter

## VELOCITY TEMPLATES

TEMPLATE_LIST_ORDERS = r"""
<soapenv:Envelope
  xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
  xmlns:u="http://ws.sodmt.uca.es/">
  <soapenv:Header/>
  <soapenv:Body>
    <u:list/>
  </soapenv:Body>
</soapenv:Envelope>
"""

## TEST BODY

class TestRunner:
    def __call__(self):
        Velocity.init()

        def invoke():
            response = HTTPRequest().POST(
                "http://localhost:8080/orders",
                render(VelocityContext(), "ListOrders", TEMPLATE_LIST_ORDERS))

            stats = grinder.statistics.getForCurrentTest()
            if stats.time > 150 or response.statusCode != 200:
                stats.success = 0

        test = Test(1, "Query order by ID").wrap(invoke)
        test()

## UTILITY FUNCTIONS

def render(context, logString, template):
    sWriter = StringWriter()
    Velocity.evaluate(context, sWriter, logString, template)
    return sWriter.toString()
