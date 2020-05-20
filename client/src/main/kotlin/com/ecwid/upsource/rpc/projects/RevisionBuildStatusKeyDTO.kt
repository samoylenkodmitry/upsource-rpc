package com.ecwid.upsource.rpc.projects

data class RevisionBuildStatusKeyDTO(
	/**
	 * Build status: Success(1), Failed(2), InProgress(3) (required)
	 */
	val status: BuildStatusEnum,

	/**
	 * Build name (e.g. "#1.0.1000") (optional)
	 */
	val name: String? = null,

	/**
	 * Build URL (e.g. "http://teamcity-server/build-url") (optional)
	 */
	val url: String? = null,

	/**
	 * Build description (e.g. "120 of 1500 tests failed") (optional)
	 */
	val description: String? = null
) {
	internal constructor() : this(
		status = BuildStatusEnum.SUCCESS,
		name = null,
		url = null,
		description = null
	)
}
