package com.ecwid.upsource.rpc.projects

data class FileDiffSummaryDTO(
	/**
	 * See FileInRevisionDTO parameters (required)
	 */
	val file: com.ecwid.upsource.rpc.ids.FileInRevisionDTO,

	/**
	 * How many lines were added (required)
	 */
	val addedLines: Int,

	/**
	 * How many lines were deleted (required)
	 */
	val removedLines: Int
) {
	internal constructor() : this(
		file = com.ecwid.upsource.rpc.ids.FileInRevisionDTO(),
		addedLines = 0,
		removedLines = 0
	)
}
