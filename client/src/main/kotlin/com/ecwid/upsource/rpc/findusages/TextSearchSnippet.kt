package com.ecwid.upsource.rpc.findusages

data class TextSearchSnippet(
	/**
	 * Snippet text (required)
	 */
	val text: String,

	/**
	 * Start line number (required)
	 */
	val startLineNumber: Int,

	/**
	 * Matching range in the snippet (required)
	 */
	val rangeInSnippet: com.ecwid.upsource.rpc.ids.RangeDTO,

	/**
	 * Matching range in the file (required)
	 */
	val rangeInFile: com.ecwid.upsource.rpc.ids.RangeDTO
) {
	internal constructor() : this(
		text = "",
		startLineNumber = 0,
		rangeInSnippet = com.ecwid.upsource.rpc.ids.RangeDTO(),
		rangeInFile = com.ecwid.upsource.rpc.ids.RangeDTO()
	)
}
