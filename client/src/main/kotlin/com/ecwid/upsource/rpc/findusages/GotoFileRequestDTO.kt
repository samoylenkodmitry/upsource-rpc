package com.ecwid.upsource.rpc.findusages

data class GotoFileRequestDTO(
	/**
	 * Project ID in Upsource (optional)
	 */
	val projectId: String? = null,

	/**
	 * ID of the revision (search in heads if not provided) (optional)
	 */
	val revisionId: String? = null,

	/**
	 * See ReviewIdDTO parameters (optional)
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO? = null,

	/**
	 * Search query, e.g. part of the name (required)
	 */
	val pattern: String,

	/**
	 * Number of results to return (required)
	 */
	val limit: Int
) {
	internal constructor() : this(
		projectId = null,
		revisionId = null,
		reviewId = null,
		pattern = "",
		limit = 0
	)
}
