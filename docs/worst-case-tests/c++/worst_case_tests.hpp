#ifndef WORST_CASE_TESTS_HPP
#define WORST_CASE_TESTS_HPP 1

#include <vector>
#include <gmpxx.h>
using std::vector;

/**
   Function which samples the space of all fork-join graphs with a
   certain number of levels that can meet a specific response time and
   whose weights are bounded by a constant.

   The graphs are classified by the number of top-level paths which
   would have to be considered in the initial node.

   counts[i] will contain the number of graphs with i+1 incomparable
   paths at the fork node in the first level (closest to the initial
   node) and 2^i incomparable paths at the fork node in the i-th level
   from it.
*/
void sample_toplevel_paths(const unsigned levels,
                           const double response_time,
                           const vector<double>& minimum_times,
                           const vector<double>& weights,
                           vector<mpz_class>& counts);

#endif // WORST_CASE_TESTS_HPP
