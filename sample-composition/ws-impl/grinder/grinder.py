from net.grinder.script.Grinder import grinder
from net.grinder.script   import Test
from org.apache.cxf.jaxws import JaxWsProxyFactoryBean
from es.uca.sodmt.ws      import Orders

ordersWSF = JaxWsProxyFactoryBean()
ordersWSF.setServiceClass(Orders)
ordersWSF.setAddress("http://localhost:8080/orders")
ordersWS  = ordersWSF.create()

class TestRunner:
    def __call__(self):
        def service():
            ordersWS.list()
            stats = grinder.statistics.getForCurrentTest()
            if stats.time > 150:
                stats.success = 0

        wrappedWS = Test(1, "Query an order by ID").wrap(service)
        wrappedWS()
