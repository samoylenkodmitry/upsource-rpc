package com.ecwid.upsource.rpc.projects

data class SimpleDiscussionCounterDTO(
	/**
	 * Total number of discussions (required)
	 */
	val count: Int,

	/**
	 * Contains unresolved discussions (required)
	 */
	val hasUnresolved: Boolean,

	/**
	 * Number of unresolved discussions (required)
	 */
	val unresolvedCount: Int,

	/**
	 * Number of resolved discussions (required)
	 */
	val resolvedCount: Int
) {
	internal constructor() : this(
		count = 0,
		hasUnresolved = false,
		unresolvedCount = 0,
		resolvedCount = 0
	)
}
