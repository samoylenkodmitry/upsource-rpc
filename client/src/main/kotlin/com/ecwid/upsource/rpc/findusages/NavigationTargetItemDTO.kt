package com.ecwid.upsource.rpc.findusages

data class NavigationTargetItemDTO(
	/**
	 * See FileInRevisionDTO parameters (required)
	 */
	val fileId: com.ecwid.upsource.rpc.ids.FileInRevisionDTO,

	/**
	 * Start offset (required)
	 */
	val startOffset: Int,

	/**
	 * End offset (required)
	 */
	val endOffset: Int,

	/**
	 * Stub index ID (required)
	 */
	val stubIndex: Int,

	/**
	 * See TargetDescriptionDTO parameters (optional)
	 */
	val targetDescription: TargetDescriptionDTO? = null
) {
	internal constructor() : this(
		fileId = com.ecwid.upsource.rpc.ids.FileInRevisionDTO(),
		startOffset = 0,
		endOffset = 0,
		stubIndex = 0,
		targetDescription = null
	)
}
