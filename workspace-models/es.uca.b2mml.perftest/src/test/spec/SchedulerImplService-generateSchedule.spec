typedef int (min=1, max=100) TQuantity;
typedef string (values={"PPR-RC2", "PPR-RC4", "PPR-RM2", "PPR-RM4", "PPR-RL2", "PPR-RL4"}) ProductProductionRule;
typedef string (values={"Pieces"}) Unit;
typedef tuple (element={string, ProductProductionRule, TQuantity, Unit}) TGenerateSchedule;
TGenerateSchedule generateSchedule;
