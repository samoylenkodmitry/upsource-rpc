package com.ecwid.upsource.rpc.findusages

data class UsagesDiffResponseDTO(
	/**
	 * ID of the old revision (required)
	 */
	val oldRevisionId: String,

	/**
	 * ID of the new revision (required)
	 */
	val newRevisionId: String,

	/**
	 * See UsagesDiffDTO parameters (repeated)
	 */
	val usages: List<UsagesDiffDTO> = emptyList()
) {
	internal constructor() : this(
		oldRevisionId = "",
		newRevisionId = "",
		usages = emptyList()
	)
}
