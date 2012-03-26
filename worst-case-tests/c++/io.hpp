#ifndef IO_HPP
#define IO_HPP 1

#include <iostream>
#include <vector>
#include <list>
#include <iterator>
#include <algorithm>

template<typename T>
std::ostream& operator <<(std::ostream& os, const std::vector<T>& v) {
  std::copy(v.begin(), v.end(), std::ostream_iterator<T>(os, " "));
  return os;
}

template<typename T>
std::ostream& operator <<(std::ostream& os, const std::list<T>& v) {
  std::copy(v.begin(), v.end(), std::ostream_iterator<T>(os, " "));
  return os;
}

#endif // IO_HPP
