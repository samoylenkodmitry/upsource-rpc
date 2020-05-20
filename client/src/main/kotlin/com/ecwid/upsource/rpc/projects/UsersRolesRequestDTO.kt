package com.ecwid.upsource.rpc.projects

data class UsersRolesRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Paging offset (required)
	 */
	val offset: Int,

	/**
	 * Page size (required)
	 */
	val pageSize: Int,

	/**
	 * Search query (optional)
	 */
	val query: String? = null
) {
	internal constructor() : this(
		projectId = "",
		offset = 0,
		pageSize = 0,
		query = null
	)
}
