package com.ecwid.upsource.rpc.projects

data class ProjectSettingsDTO(
	/**
	 * Project name (required)
	 */
	val projectName: String,

	/**
	 * VCS configuration represented as a JSON-encoded string (optional)
	 */
	val vcsSettings: String? = null,

	/**
	 * How often to check for new commits (in seconds) (optional)
	 */
	val checkIntervalSeconds: Long? = null,

	/**
	 * See ProjectModel parameters (required)
	 */
	val projectModel: ProjectModel,

	/**
	 * Code review ID pattern (required)
	 */
	val codeReviewIdPattern: String,

	/**
	 * Whether to run code inspections (optional)
	 */
	val runInspections: Boolean? = null,

	/**
	 * Name of the inspection profile in IntelliJ IDEA (optional)
	 */
	val inspectionProfileName: String? = null,

	/**
	 * The contents of maven-settings.xml (optional)
	 */
	val mavenSettings: String? = null,

	/**
	 * Maven profiles. Space- or comma-separated list (optional)
	 */
	val mavenProfiles: String? = null,

	/**
	 * Maven project JDK (optional)
	 */
	val mavenJdkName: String? = null,

	/**
	 * Model conversion system properties (optional)
	 */
	val modelConversionSystemProperties: String? = null,

	/**
	 * Gradle properties (optional)
	 */
	val gradleProperties: String? = null,

	/**
	 * Gradle init script (optional)
	 */
	val gradleInitScript: String? = null,

	/**
	 * See ExternalLinkDTO parameters (repeated)
	 */
	val externalLinks: List<ExternalLinkDTO> = emptyList(),

	/**
	 * See IssueTrackerProviderSettingsDTO parameters (optional)
	 */
	val issueTrackerProviderSettings: com.ecwid.upsource.rpc.issuetrackers.IssueTrackerProviderSettingsDTO? = null,

	/**
	 * Hub user management page URL (optional)
	 */
	val userManagementUrl: String? = null,

	/**
	 * Default encoding (e.g. UTF-8) (optional)
	 */
	val defaultEncoding: String? = null,

	/**
	 * Default branch (optional)
	 */
	val defaultBranch: String? = null,

	/**
	 * A newline-separated list of wildcards. Files matching the patterns specified here will be excluded from reviews (repeated)
	 */
	val ignoredFilesInReview: List<String> = emptyList(),

	/**
	 * A newline-separated list of wildcards. Files matching the patterns specified here — binaries, for example — won't be imported. (repeated)
	 */
	val skipFileContentsImport: List<String> = emptyList(),

	/**
	 * JavaScript language level (one of the following: JS_1_5, ES5, JS_1_8_5, ES6, JSX, NASHORN, FLOW) (optional)
	 */
	val javascriptLanguageLevel: String? = null,

	/**
	 * PHP language level (one of the following: null, 5.3.0, 5.4.0, 5.5.0, 5.6.0, 7, 7.1) (optional)
	 */
	val phpLanguageLevel: String? = null,

	/**
	 * List of paths to external dependencies for a PHP project (repeated)
	 */
	val phpExternalDependencies: List<String> = emptyList(),

	/**
	 * List of commands that will be run to set up PHP composer. Default command is "php composer.phar install" (repeated)
	 */
	val phpComposerScript: List<String> = emptyList(),

	/**
	 * Python language level (one of the following: null, 2, 3) (optional)
	 */
	val pythonLanguageLevel: String? = null,

	/**
	 * "login:password" credentials used to receive build status from the build server (optional)
	 */
	val buildStatusReceiveToken: String? = null,

	/**
	 * In addition to CLOSE_REVIEW permission, controls whether review authors can close reviews (optional)
	 */
	val authorCanCloseReview: Boolean? = null,

	/**
	 * In addition to DELETE_REVIEW permission, controls whether review authors can delete reviews (optional)
	 */
	val authorCanDeleteReview: Boolean? = null,

	/**
	 * In addition to EDIT_REVIEW permission, controls whether only the person that started a discussion can resolve it (optional)
	 */
	val limitResolveDiscussion: Boolean? = null,

	/**
	 * Default review deadline, in hours (optional)
	 */
	val reviewDeadlineHours: Int? = null,

	/**
	 * Sets whether merge commits should be added to branch reviews (optional)
	 */
	val addMergeCommitsToBranchReview: Boolean? = null,

	/**
	 * Whether the project is archived (optional)
	 */
	val isArchived: Boolean? = null
) {
	internal constructor() : this(
		projectName = "",
		vcsSettings = null,
		checkIntervalSeconds = null,
		projectModel = ProjectModel(),
		codeReviewIdPattern = "",
		runInspections = null,
		inspectionProfileName = null,
		mavenSettings = null,
		mavenProfiles = null,
		mavenJdkName = null,
		modelConversionSystemProperties = null,
		gradleProperties = null,
		gradleInitScript = null,
		externalLinks = emptyList(),
		issueTrackerProviderSettings = null,
		userManagementUrl = null,
		defaultEncoding = null,
		defaultBranch = null,
		ignoredFilesInReview = emptyList(),
		skipFileContentsImport = emptyList(),
		javascriptLanguageLevel = null,
		phpLanguageLevel = null,
		phpExternalDependencies = emptyList(),
		phpComposerScript = emptyList(),
		pythonLanguageLevel = null,
		buildStatusReceiveToken = null,
		authorCanCloseReview = null,
		authorCanDeleteReview = null,
		limitResolveDiscussion = null,
		reviewDeadlineHours = null,
		addMergeCommitsToBranchReview = null,
		isArchived = null
	)
}
