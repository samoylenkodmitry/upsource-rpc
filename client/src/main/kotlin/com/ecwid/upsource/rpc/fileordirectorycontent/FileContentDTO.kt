package com.ecwid.upsource.rpc.fileordirectorycontent

data class FileContentDTO(
	/**
	 * File text (required)
	 */
	val text: String,

	/**
	 * See FoldingInfoDTO parameters (repeated)
	 */
	val foldings: List<FoldingInfoDTO> = emptyList(),

	/**
	 * Whether syntax markup is available for this file type (optional)
	 */
	val isSyntaxSupported: Boolean? = null,

	/**
	 * See TextMarkupDTO parameters (repeated)
	 */
	val syntax: List<TextMarkupDTO> = emptyList()
) {
	internal constructor() : this(
		text = "",
		foldings = emptyList(),
		isSyntaxSupported = null,
		syntax = emptyList()
	)
}
