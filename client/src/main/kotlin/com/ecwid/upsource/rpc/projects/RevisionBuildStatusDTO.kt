package com.ecwid.upsource.rpc.projects

data class RevisionBuildStatusDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * VCS revision ID (required)
	 */
	val revisionId: String,

	/**
	 * A unique build identifier (e.g. PROJECT-VERSION-1234) (repeated)
	 */
	val keys: List<RevisionBuildStatusKeyDTO> = emptyList()
) {
	internal constructor() : this(
		projectId = "",
		revisionId = "",
		keys = emptyList()
	)
}
