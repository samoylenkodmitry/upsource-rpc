package com.ecwid.upsource.rpc.projects

data class BranchingRevisionSuggestion(
	/**
	 * Revision ID to suggest (required)
	 */
	val revisionId: String,

	/**
	 * The number of revisions to the left locator (required)
	 */
	val pathToLeftSize: Int,

	/**
	 * The number of revisions to the right locator (required)
	 */
	val pathToRightSize: Int
) {
	internal constructor() : this(
		revisionId = "",
		pathToLeftSize = 0,
		pathToRightSize = 0
	)
}
