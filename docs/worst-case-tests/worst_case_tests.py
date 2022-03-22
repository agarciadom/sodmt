#!/usr/bin/python3.1

# Test programs for the worst-case analysis of the optimised time
# limit inference algorithm.
#
# Copyright (C) 2011 Antonio García-Domínguez
# Licensed under the GNU GPLv3 or later <http://www.gnu.org/licenses/gpl.html>

from collections import defaultdict


def frange(start, stop, step):
    steps = 0
    current = start
    while current <= stop:
        yield current
        steps += 1
        current = start + steps * step
    raise StopIteration


def is_less_or_just_as_strict_than(L, c1, c2):
    a, b = c1
    c, d = c2
    return a <= c and (b <= d or a < L and b > d and (b-d)*L <= b*c-a*d)


def count_worst_case_instances(n_levels, max_mtime, max_weight):
    annotations_by_level = []
    subpath_constr_by_level = [[(0.0, 0.0)]]
    instances_by_top_level_paths = defaultdict(lambda: 0)

    def addSubpathConstraint(constraint, subpathConstraints):
        i = 0
        while i < len(subpathConstraints):
            prevConstraint = subpathConstraints[i]
            if is_less_or_just_as_strict_than(max_mtime, constraint, prevConstraint):
                return
            elif is_less_or_just_as_strict_than(max_mtime, prevConstraint, constraint):
                del subpathConstraints[i]
            else:
                i = i + 1

        subpathConstraints.append(constraint)

    # Auxiliary recursive function for easy backtracking
    def aux():
        max_min_time_limit = max(c[0] for c in subpath_constr_by_level[-1])

        for a, b, c, d in ((a, b, c, d)
                           for a in frange(0.0, max_mtime, 0.2)
                           for b in frange(0.0, max_weight, 2)
                           for c in frange(0.0, max_mtime, 0.2)
                           for d in frange(0.0, max_weight, 2)):

            # Build the constraints of all the subpaths for this level
            new_level_constr = []
            for constraint in subpath_constr_by_level[-1]:
                new_ab = (a + constraint[0], b + constraint[1])
                new_cd = (c + constraint[0], d + constraint[1])
                addSubpathConstraint(new_ab, new_level_constr)
                addSubpathConstraint(new_cd, new_level_constr)

            subpath_constr_by_level.append(new_level_constr)
            annotations_by_level.append(((a, b), (c, d)))

            if len(annotations_by_level) == n_levels:
                # We need to know the number of top-level paths left
                # in all worst-case graphs with n_levels levels formed
                # from a worst-case graph with n_levels-1 levels
                instances_by_top_level_paths[len(new_level_constr)] += 1
            elif len(new_level_constr) == 2**len(annotations_by_level):
                # Recursive calls only get through if all paths remained
                aux()

            del subpath_constr_by_level[-1]
            del annotations_by_level[-1]

    aux()
    return instances_by_top_level_paths

if __name__ == "__main__":
    #find_simple_worst_case_counterexample(L=1,
    #    min_mtime=0.0, max_mtime=1, step_mtime=0.1,
    #    min_weight=1.0, max_weight=10, step_weight=1)
    for n_levels in range(1, 6):
        print("{0:d} level(s):".format(n_levels))
        count_map = count_worst_case_instances(n_levels, 1.0, 10.0)

        max_paths = 2**n_levels
        total = float(sum(count_map.values()))
        if total == 0:
            print(" no instances have {0:d} top-level path(s)"
                  .format(max_paths))
            continue

        for n_paths in range(1, max_paths + 1):
            print(" - {0:d} instances with {1:d} top-level path(s) ({2:g}%)"
                  .format(count_map[n_paths],
                          n_paths,
                          100 * count_map[n_paths]/total))
        print("")
