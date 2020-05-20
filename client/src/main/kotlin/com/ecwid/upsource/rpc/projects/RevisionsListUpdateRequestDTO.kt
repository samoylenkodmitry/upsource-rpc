package com.ecwid.upsource.rpc.projects

data class RevisionsListUpdateRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Number of revisions to return (required)
	 */
	val limit: Int,

	/**
	 * Current head revision ID (optional)
	 */
	val hash: String? = null,

	/**
	 * Additional filter by message (applied as AND) (repeated)
	 */
	val messageSubstring: List<String> = emptyList()
) {
	internal constructor() : this(
		projectId = "",
		limit = 0,
		hash = null,
		messageSubstring = emptyList()
	)
}
