#include <vector>
#include <iostream>
#include <algorithm>
#include "io.hpp"
#include "worst_case_tests.hpp"
using namespace std;

/**
   Returns a vector with a sequence of numbers, starting at start and
   increasing by step while the number is less than or equal to end.
 */
template<typename T>
vector<T> range(T start, T end, T step) {
  vector<T> result;
  for (T i = start; i <= end; i = i + step) {
    result.push_back(i);
  }
  return result;
}

template<typename T, typename I>
T sum(T initial, I start, I end) {
  for (I i = start; i != end; i++) {
    initial = initial + *i;
  }
  return initial;
}

int main(int argc, char* argv[]) {
  if (argc != 2) {
    cerr << "Usage: " << argv[0] << " (response time in seconds)" << endl;
    return 1;
  }

  const double RESPONSE_TIME   = atof(argv[1]);
  const double MINIMUM_MINTIME = 0.0;
  const double MINIMUM_WEIGHT  = 0.0;
  const double MAXIMUM_MINTIME = min(RESPONSE_TIME, 1.0);
  const double MAXIMUM_WEIGHT  = 10;
  const double STEP_MINTIME = 0.1;
  const double STEP_WEIGHT  = 1.0;
  const unsigned MIN_LEVELS = 1;
  const unsigned MAX_LEVELS = 5;

  vector<double> minimum_times
    = range(MINIMUM_MINTIME, MAXIMUM_MINTIME, STEP_MINTIME);
  vector<double> weights
    = range(MINIMUM_WEIGHT, MAXIMUM_WEIGHT, STEP_WEIGHT);

  cout << "Response time: " << RESPONSE_TIME << endl;
  cout << "Minimum times: " << minimum_times << endl;
  cout << "Weights: " << weights << endl;

  vector<mpz_class> counts;
  for (unsigned levels = MIN_LEVELS; levels <= MAX_LEVELS; ++levels) {
    sample_toplevel_paths(levels, RESPONSE_TIME,
                          minimum_times, weights, counts);

    const mpz_class total = sum(mpz_class(0), counts.begin(), counts.end());
    cout << levels << " levels (" << total << " instances):" << endl;

    if (total == 0) {
      cout << "  no instances have " << (1 << levels) << " paths" << endl;
      break;
    }
    else {
      for (int i = 0; i < counts.size(); ++i) {
        const mpf_class percent = mpf_class(mpq_class(100 * counts[i], total));
        cout << " - " << counts[i] << " instances with "
             << (i+1) << " top-level path(s) ("
             << percent << "%)" << endl;
      }
    }
  }

  return 0;
}
