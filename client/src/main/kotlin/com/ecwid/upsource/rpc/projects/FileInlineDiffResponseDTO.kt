package com.ecwid.upsource.rpc.projects

data class FileInlineDiffResponseDTO(
	/**
	 * Whether file contents are identical in both revisions (required)
	 */
	val isIdentical: Boolean,

	/**
	 * Text of the diff (required)
	 */
	val text: String,

	/**
	 * See FileInRevisionDTO parameters (optional)
	 */
	val oldFile: com.ecwid.upsource.rpc.ids.FileInRevisionDTO? = null,

	/**
	 * See FileInRevisionDTO parameters (optional)
	 */
	val newFile: com.ecwid.upsource.rpc.ids.FileInRevisionDTO? = null,

	/**
	 * See FileContentTypeDTO parameters (required)
	 */
	val contentType: com.ecwid.upsource.rpc.fileordirectorycontent.FileContentTypeDTO,

	/**
	 * How many lines were added (repeated)
	 */
	val addedLines: List<Int> = emptyList(),

	/**
	 * How many lines were removed (repeated)
	 */
	val removedLines: List<Int> = emptyList(),

	/**
	 * How many lines were modified (repeated)
	 */
	val modifiedLines: List<Int> = emptyList(),

	/**
	 * Ranges of collapsed text (lines) (repeated)
	 */
	val collapsedLines: List<com.ecwid.upsource.rpc.ids.RangeDTO> = emptyList(),

	/**
	 * Ranges of text that were added (repeated)
	 */
	val addedRanges: List<com.ecwid.upsource.rpc.ids.RangeDTO> = emptyList(),

	/**
	 * Ranges of text that were removed (repeated)
	 */
	val removedRanges: List<com.ecwid.upsource.rpc.ids.RangeDTO> = emptyList(),

	/**
	 * Determines if syntax markup is supported for this file type (optional)
	 */
	val isSyntaxSupported: Boolean? = null,

	/**
	 * See TextMarkupDTO parameters (repeated)
	 */
	val syntaxMarkup: List<com.ecwid.upsource.rpc.fileordirectorycontent.TextMarkupDTO> = emptyList(),

	/**
	 * A mapping of diff ranges to ranges in the old document (repeated)
	 */
	val diffToOldDocument: List<RangeMappingDTO> = emptyList(),

	/**
	 * A mapping of diff ranges to ranges in the new document (repeated)
	 */
	val diffToNewDocument: List<RangeMappingDTO> = emptyList(),

	/**
	 * Line numbers as they appear in the old file (repeated)
	 */
	val oldLineNumbers: List<Int> = emptyList(),

	/**
	 * Line numbers as they appear in the new file (repeated)
	 */
	val newLineNumbers: List<Int> = emptyList(),

	/**
	 * Authors of code fragments in the review diff (repeated)
	 */
	val annotation: List<FileAnnotationSectionDTO> = emptyList(),

	/**
	 * Some changes were filtered out (in the review diff) (optional)
	 */
	val hasUnrelatedChanges: Boolean? = null,

	/**
	 * When the diff relates to the merge result, holds the conflict type (see ConflictTypeEnum) (optional)
	 */
	val conflictType: ConflictTypeEnum? = null
) {
	internal constructor() : this(
		isIdentical = false,
		text = "",
		oldFile = null,
		newFile = null,
		contentType = com.ecwid.upsource.rpc.fileordirectorycontent.FileContentTypeDTO(),
		addedLines = emptyList(),
		removedLines = emptyList(),
		modifiedLines = emptyList(),
		collapsedLines = emptyList(),
		addedRanges = emptyList(),
		removedRanges = emptyList(),
		isSyntaxSupported = null,
		syntaxMarkup = emptyList(),
		diffToOldDocument = emptyList(),
		diffToNewDocument = emptyList(),
		oldLineNumbers = emptyList(),
		newLineNumbers = emptyList(),
		annotation = emptyList(),
		hasUnrelatedChanges = null,
		conflictType = null
	)
}
