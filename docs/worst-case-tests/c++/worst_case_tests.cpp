#include <algorithm>
#include <limits>
#include <utility>
#include <stdexcept>
#include "constraints.hpp"
#include "worst_case_tests.hpp"
using namespace std;

namespace {
  double get_max_min_time_limit(const Constraints& constraints) {
    double res = numeric_limits<double>::min();
    for (Constraints::Elements::const_iterator it = constraints.begin();
         it != constraints.end();
         ++it) {
      res = max(it->minimum_time, res);
    }
    return res;
  }

  /**
     Utility class to generate pairs of constraints, avoiding an ugly
     4-level nested loop in aux().
  */
  template<typename I>
  class ConstraintPairGenerator {
  public:
    ConstraintPairGenerator(double resp_t, I begin_mt, I end_mt, I begin_w, I end_w)
      : it_a(begin_mt), it_b(begin_w),
        it_c(begin_mt), it_d(begin_w),
        begin_mt(begin_mt), begin_w(begin_w),
        end_mt(end_mt), end_w(end_w), resp_t(resp_t) {}

    pair<Constraint, Constraint> next() throw (out_of_range) {
      if (it_a == end_mt) {
        throw out_of_range("No pairs left to generate");
      }

      Constraint c_ab(resp_t, *it_a, *it_b);
      Constraint c_cd(resp_t, *it_c, *it_d);

      it_d++;
      if (it_d == end_w) {
        it_d = begin_w;
        ++it_c;
        if (it_c == end_mt) {
          it_c = begin_mt;
          ++it_b;
          if (it_b == end_w) {
            it_b = begin_w;
            ++it_a;
          }
        }
      }
      return make_pair(c_ab, c_cd);
    }

    bool has_next() const {
      return it_a != end_mt;
    }

  private:
    I it_a, it_b, it_c, it_d, begin_mt, begin_w, end_mt, end_w;
    const double resp_t;
  };

  void aux(const unsigned level,
           const unsigned levels,
           const Constraints& previous_level_constraints,
           const double response_time,
           const vector<double>& minimum_times,
           const vector<double>& weights,
           vector<mpz_class>& counts) {

    // Try all pairs of annotations for the nodes in the two branches
    ConstraintPairGenerator<vector<double>::const_iterator>
      generator(response_time,
                minimum_times.begin(), minimum_times.end(),
                weights.begin(), weights.end());

  generator_loop:
    while (generator.has_next()) {
      const pair<Constraint, Constraint> pair = generator.next();
      const Constraint c_ab = pair.first, c_cd = pair.second;

      Constraints level_constraints;
      bool skip_pair = false;
      for (Constraints::Elements::const_iterator
             it_prev_constraint = previous_level_constraints.begin();
           it_prev_constraint != previous_level_constraints.end();
           ++it_prev_constraint) {
        const Constraint prev_constraint = *it_prev_constraint;
        const Constraint ab_constraint = c_ab + prev_constraint;
        const Constraint cd_constraint = c_cd + prev_constraint;
        if (ab_constraint.minimum_time > response_time
            || cd_constraint.minimum_time > response_time) {
          skip_pair = true;
          break;
        }

        level_constraints.add(c_ab + prev_constraint);
        level_constraints.add(c_cd + prev_constraint);
      }
      if (skip_pair) continue;

      if (level == levels)
        counts[level_constraints.size()-1]++;
      else if (level_constraints.size() == (1 << level)) {
        aux(level+1, levels, level_constraints,
            response_time,
            minimum_times, weights, counts);
      }
    } // all pairs of constraints
  } // aux
}

void sample_toplevel_paths(const unsigned levels,
                           const double response_time,
                           const vector<double>& minimum_times,
                           const vector<double>& weights,
                           vector<mpz_class>& counts)
{
  Constraints level0_constraints;
  level0_constraints.add(Constraint(response_time));
  counts.clear();
  counts.resize(1 << levels, 0);

  aux(1, levels, level0_constraints,
      response_time,
      minimum_times, weights, counts);
}
