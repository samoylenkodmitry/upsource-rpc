package com.ecwid.upsource.rpc.projects

data class StacktracePositionDTO(
	/**
	 * Line number that corresponds to the given stacktrace (required)
	 */
	val lineNumber: Int,

	/**
	 * A full path of the file (required)
	 */
	val fullPath: String,

	/**
	 * Revision ID (optional)
	 */
	val vcsCommitId: String? = null,

	/**
	 * See RangeDTO parameters (optional)
	 */
	val interpolatedRange: com.ecwid.upsource.rpc.ids.RangeDTO? = null
) {
	internal constructor() : this(
		lineNumber = 0,
		fullPath = "",
		vcsCommitId = null,
		interpolatedRange = null
	)
}
