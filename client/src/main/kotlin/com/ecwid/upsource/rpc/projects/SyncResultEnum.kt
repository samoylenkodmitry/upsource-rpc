package com.ecwid.upsource.rpc.projects

/**
 * Describes status of a GitHub/GitLab synchronisation
 */
enum class SyncResultEnum(val value: Byte, val originalName: String) {
	OK(value = 1, originalName = "Ok"),
	PROJECT_NOT_SYNCHRONIZED(value = 2, originalName = "ProjectNotSynchronized"),
	COMMENT_NOT_SYNCHRONIZED(value = 3, originalName = "CommentNotSynchronized"),
	REVIEW_NOT_SYNCHRONIZED(value = 4, originalName = "ReviewNotSynchronized"),
	ACCESS_TOKEN_NOT_PROVIDED(value = 5, originalName = "AccessTokenNotProvided"),
	GITHUB_MISCONFIGURATION(value = 6, originalName = "GithubMisconfiguration"),
	UNSUPPORTED_METHOD(value = 7, originalName = "UnsupportedMethod"),
	NOT_FOUND(value = 8, originalName = "NotFound"),
	INTERNAL_ERROR(value = 9, originalName = "InternalError"),
	RATE_LIMIT_EXCEEDED(value = 10, originalName = "RateLimitExceeded"),
	IO_ERROR(value = 11, originalName = "IoError");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
