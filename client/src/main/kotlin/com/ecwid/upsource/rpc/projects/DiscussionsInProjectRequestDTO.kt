package com.ecwid.upsource.rpc.projects

data class DiscussionsInProjectRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * A query string (required)
	 */
	val query: String,

	/**
	 * Number of discussions to return (required)
	 */
	val limit: Int,

	/**
	 * Number of discussions to skip from the top (for pagination) (optional)
	 */
	val skip: Int? = null
) {
	internal constructor() : this(
		projectId = "",
		query = "",
		limit = 0,
		skip = null
	)
}
