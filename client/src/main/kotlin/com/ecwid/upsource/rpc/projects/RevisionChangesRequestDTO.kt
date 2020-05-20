package com.ecwid.upsource.rpc.projects

data class RevisionChangesRequestDTO(
	/**
	 * See RevisionInProjectDTO parameters (required)
	 */
	val revision: com.ecwid.upsource.rpc.ids.RevisionInProjectDTO,

	/**
	 * ID of the revision to compare with (optional)
	 */
	val compareToRevisionId: String? = null,

	/**
	 * How many files to return (required)
	 */
	val limit: Int,

	/**
	 * Number of files to skip from the top (for pagination) (optional)
	 */
	val skip: Int? = null
) {
	internal constructor() : this(
		revision = com.ecwid.upsource.rpc.ids.RevisionInProjectDTO(),
		compareToRevisionId = null,
		limit = 0,
		skip = null
	)
}
