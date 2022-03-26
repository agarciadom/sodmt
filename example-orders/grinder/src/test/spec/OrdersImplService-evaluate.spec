typedef int (min=-9223372036854775808, max=9223372036854775807) TArticleID;
typedef list (element=float, min=0, max=1) TList_float;
typedef tuple (element={TArticleID, TList_float}) TArticleQuantities;
typedef list (element=TArticleQuantities, min=0) TNewOrder;
typedef list (element=TNewOrder, min=0, max=1) TEvaluate;
TEvaluate evaluate;

