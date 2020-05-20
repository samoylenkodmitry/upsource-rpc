package com.ecwid.upsource.rpc.findusages

data class FindBranchRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Search query, e.g. part of the branch name (required)
	 */
	val pattern: String,

	/**
	 * Max number of results to return (required)
	 */
	val limit: Int
) {
	internal constructor() : this(
		projectId = "",
		pattern = "",
		limit = 0
	)
}
