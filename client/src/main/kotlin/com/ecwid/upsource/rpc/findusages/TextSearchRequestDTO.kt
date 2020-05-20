package com.ecwid.upsource.rpc.findusages

data class TextSearchRequestDTO(
	/**
	 * Project ID in Upsource (optional)
	 */
	val projectId: String? = null,

	/**
	 * The search query (required)
	 */
	val query: String,

	/**
	 * File name filter (optional)
	 */
	val filenameFilter: String? = null,

	/**
	 * Ignore matches in deleted files (required)
	 */
	val ignoreDeleted: Boolean,

	/**
	 * Whether to search in archived projects (required)
	 */
	val ignoreArchived: Boolean
) {
	internal constructor() : this(
		projectId = null,
		query = "",
		filenameFilter = null,
		ignoreDeleted = false,
		ignoreArchived = false
	)
}
