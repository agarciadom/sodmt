#include "constraints.hpp"

void Constraints::add(const Constraint& c) {
  // Use two iterators: one for checking the current element, and
  // another for finding the next element (as the iterator to the
  // current element may have been invalidated)
  list<Constraint>::iterator iter_current = constraints.begin();
  list<Constraint>::iterator iter_next = iter_current;
  ++iter_next;

  while (iter_current != constraints.end()) {
    const Constraint& current = *iter_current;
    if (c <= current)
      return;
    else if (current <= c)
      constraints.erase(iter_current);

    iter_current = iter_next;
    iter_next++;
  }

  constraints.push_back(c);
}

ostream& operator<<(ostream& os, const Constraint& c) {
  os << "(" << c.minimum_time << ", " << c.weight << ")";
  return os;
}

ostream& operator<<(ostream& os, const Constraints& c) {
  os << "{";
  if (!c.empty()) {
    Constraints::Elements::const_iterator it = c.begin();
    os << *it;
    while (++it != c.end()) {
      os << ", " << *it;
    }
  }
  os << "}";
  return os;
}
