from net.grinder.script.Grinder import grinder
from net.grinder.script         import Test
from net.grinder.plugin.http    import HTTPRequest

class TestRunner:
    def __call__(self):
        def invoke():
            response = HTTPRequest().POST("http://localhost:8080/orders", """
<soapenv:Envelope
  xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
  xmlns:u="http://ws.sodmt.uca.es/">
  <soapenv:Header/>
  <soapenv:Body>
    <u:list/>
  </soapenv:Body>
</soapenv:Envelope>
""")

            stats = grinder.statistics.getForCurrentTest()
            if stats.time > 150 or response.statusCode != 200:
                stats.success = 0
                     
        test = Test(1, "Query order by ID").wrap(invoke)
        test()
