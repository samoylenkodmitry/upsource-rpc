package com.ecwid.upsource.rpc.projects

data class ReviewsRequestDTO(
	/**
	 * Number of reviews to return (required)
	 */
	val limit: Int,

	/**
	 * Search query (e.g. "state: open") and/or phrase appearing in review title or discussion (optional)
	 */
	val query: String? = null,

	/**
	 * Sort by: last updated ("updated", default), review ID ("id,asc", "id,desc"), title ("title"), due date ("deadline,asc", "deadline,desc") (optional)
	 */
	val sortBy: String? = null,

	/**
	 * Project ID in Upsource (optional)
	 */
	val projectId: String? = null,

	/**
	 * Number of reviews to skip from the top (for pagination) (optional)
	 */
	val skip: Int? = null
) {
	internal constructor() : this(
		limit = 0,
		query = null,
		sortBy = null,
		projectId = null,
		skip = null
	)
}
