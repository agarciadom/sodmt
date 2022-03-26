package es.uca.b2mml.domain;

/**
 * Dependency types between product and process segments.
 *
 * <em>Note</em>: do not change the order of the constants!
 */
public enum ExecutionDependencyType {
	B_CANNOT_FOLLOW_A, // 0
	B_PARALLEL_TO_A, // 1
	B_NOT_PARALLEL_TO_A, // 2
	B_AT_START_A, // 3
	B_AFTER_START_A, // 4
	B_AFTER_END_A, // 5
	B_NO_LATER_T_AFTER_START_A, // 6
	B_NO_EARLIER_T_AFTER_START_A, // 7
	B_NO_LATER_T_AFTER_END_A, // 8
	B_NO_EARLIER_T_AFTER_END_A // 9
}
