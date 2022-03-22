#ifndef CONSTRAINTS_HPP
#define CONSTRAINTS_HPP 1

#include <list>
#include <cassert>
#include <iostream>
using std::list;
using std::ostream;

/**
   Structure which represents the aggregated minimum time limit and
   weight of a path or a node.
 */
struct Constraint {
  const double resp_t, minimum_time, weight;

  Constraint(double resp_t, double mt = 0.0, double w = 0.0)
    : resp_t(resp_t), minimum_time(mt), weight(w) {}

  /**
     Returns true if the left-hand constraint is less or just as
     strict as the right-hand constraint.
   */
  inline bool operator <=(const Constraint& constraint) const {
    const double
      a = minimum_time,
      b = weight,
      c = constraint.minimum_time,
      d = constraint.weight,
      L = resp_t;

    return a <= c && (b <= d || a < L && b > d && (b-d)*L <= b*c-a*d);
  }

  Constraint operator +(const Constraint& c) const {
    return Constraint(resp_t, minimum_time + c.minimum_time, weight + c.weight);
  }
};

/**
   Class which represents a set of maximal constraints.
 */
class Constraints {
public:
  typedef list<Constraint> Elements;

  void add(const Constraint&);

  size_t size() const {
    return constraints.size();
  }

  bool empty() const {
    return constraints.empty();
  }

  Elements::iterator begin() {
    return constraints.begin();
  }

  Elements::iterator end() {
    return constraints.end();
  }

  Elements::const_iterator begin() const {
    return constraints.begin();
  }

  Elements::const_iterator end() const {
    return constraints.end();
  }

private:
  Elements constraints;
};

// OUTPUT OPERATORS

ostream& operator<<(ostream&, const Constraint&);
ostream& operator<<(ostream&, const Constraints&);

#endif // CONSTRAINTS_HPP
