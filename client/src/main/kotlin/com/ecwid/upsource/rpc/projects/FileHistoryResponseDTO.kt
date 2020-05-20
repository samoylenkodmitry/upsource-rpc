package com.ecwid.upsource.rpc.projects

data class FileHistoryResponseDTO(
	/**
	 * See FileHistoryItemDTO parameters (repeated)
	 */
	val history: List<FileHistoryItemDTO> = emptyList(),

	/**
	 * See RevisionListGraphDTO parameters (optional)
	 */
	val graph: RevisionListGraphDTO? = null,

	/**
	 * Whether all available items have been returned or more can be requested by passing the corresponding 'limit' value in the subsequent request (required)
	 */
	val hasMore: Boolean
) {
	internal constructor() : this(
		history = emptyList(),
		graph = null,
		hasMore = false
	)
}
