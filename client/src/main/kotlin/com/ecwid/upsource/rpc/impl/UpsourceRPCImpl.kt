package com.ecwid.upsource.rpc.impl

import com.ecwid.upsource.rpc.UpsourceRPC
import com.ecwid.upsource.serializer.Serializer
import com.ecwid.upsource.transport.RpcResponse
import com.ecwid.upsource.transport.RpcTransport
import java.util.logging.Level
import java.util.logging.Logger

private val log = Logger.getLogger(UpsourceRPCImpl::class.qualifiedName)

/**
 * Main RPC service implementation
 */
internal class UpsourceRPCImpl(
	private val transport: RpcTransport,
	private val serializer: Serializer
) : UpsourceRPC {

	private inline fun <reified Response> invokeMethod(methodName: String, request: Any): RpcResponse<Response> {
		val requestBody = serializer.serialize(request)
		val transportResponse = transport.makeRequest(methodName, requestBody)
		val clazz = Response::class.java
		val response = serializer.deserialize(transportResponse, clazz)
		log.log(Level.FINE, "Invoke $methodName. Request: $request. Response: $response")
		return response
	}

	override fun acceptUserAgreement(request: com.ecwid.upsource.rpc.ids.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("acceptUserAgreement", request)
	}

	override fun getUserAgreementText(request: com.ecwid.upsource.rpc.ids.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.misc.UserAgreementTextDTO> {
		return invokeMethod("getUserAgreementText", request)
	}

	override fun getAllProjects(request: com.ecwid.upsource.rpc.ids.ProjectIdListDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ShortProjectInfoListDTO> {
		return invokeMethod("getAllProjects", request)
	}

	override fun findProjects(request: com.ecwid.upsource.rpc.projects.FindProjectsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ShortProjectInfoListDTO> {
		return invokeMethod("findProjects", request)
	}

	override fun getProjectInfo(request: com.ecwid.upsource.rpc.ids.ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ProjectInfoDTO> {
		return invokeMethod("getProjectInfo", request)
	}

	override fun getProjectVcsLinks(request: com.ecwid.upsource.rpc.ids.ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.VcsRepoListDTO> {
		return invokeMethod("getProjectVcsLinks", request)
	}

	override fun getProjectReadme(request: com.ecwid.upsource.rpc.ids.ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ProjectReadmeResponseDTO> {
		return invokeMethod("getProjectReadme", request)
	}

	override fun getCodeReviewPatterns(request: com.ecwid.upsource.rpc.ids.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.projects.CodeReviewPatternsDTO> {
		return invokeMethod("getCodeReviewPatterns", request)
	}

	override fun getHeadRevision(request: com.ecwid.upsource.rpc.ids.ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionInfoDTO> {
		return invokeMethod("getHeadRevision", request)
	}

	override fun getRevisionsList(request: com.ecwid.upsource.rpc.projects.RevisionsListRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionDescriptorListDTO> {
		return invokeMethod("getRevisionsList", request)
	}

	override fun getRevisionsListFiltered(request: com.ecwid.upsource.rpc.projects.RevisionsListFilteredRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionDescriptorListDTO> {
		return invokeMethod("getRevisionsListFiltered", request)
	}

	override fun getUserRevisionsList(request: com.ecwid.upsource.rpc.projects.UserRevisionsListRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionDescriptorListDTO> {
		return invokeMethod("getUserRevisionsList", request)
	}

	override fun getRevisionsListUpdate(request: com.ecwid.upsource.rpc.projects.RevisionsListUpdateRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsListUpdateResponseDTO> {
		return invokeMethod("getRevisionsListUpdate", request)
	}

	override fun getRevisionInfo(request: com.ecwid.upsource.rpc.ids.RevisionInProjectDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionInfoDTO> {
		return invokeMethod("getRevisionInfo", request)
	}

	override fun getRevisionChanges(request: com.ecwid.upsource.rpc.projects.RevisionChangesRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsDiffDTO> {
		return invokeMethod("getRevisionChanges", request)
	}

	override fun getRevisionBranches(request: com.ecwid.upsource.rpc.ids.RevisionInProjectDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionBranchesResponseDTO> {
		return invokeMethod("getRevisionBranches", request)
	}

	override fun getProjectSubtree(request: com.ecwid.upsource.rpc.ids.FileInRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ProjectItemsListDTO> {
		return invokeMethod("getProjectSubtree", request)
	}

	override fun getFileMeta(request: com.ecwid.upsource.rpc.ids.FileInRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileMetaResponseDTO> {
		return invokeMethod("getFileMeta", request)
	}

	override fun getFileAnnotation(request: com.ecwid.upsource.rpc.ids.FileInRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileAnnotationResponseDTO> {
		return invokeMethod("getFileAnnotation", request)
	}

	override fun getFileContributors(request: com.ecwid.upsource.rpc.ids.FileInRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.fileordirectorycontent.FileContributorsResponseDTO> {
		return invokeMethod("getFileContributors", request)
	}

	override fun getFileFragmentAuthors(request: com.ecwid.upsource.rpc.projects.FileFragmentAuthorsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UsersListDTO> {
		return invokeMethod("getFileFragmentAuthors", request)
	}

	override fun getFileHistory(request: com.ecwid.upsource.rpc.projects.FileHistoryRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileHistoryResponseDTO> {
		return invokeMethod("getFileHistory", request)
	}

	override fun getFileDiff(request: com.ecwid.upsource.rpc.projects.FileDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileDiffResponseDTO> {
		return invokeMethod("getFileDiff", request)
	}

	override fun getFileInlineDiff(request: com.ecwid.upsource.rpc.projects.FileDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileInlineDiffResponseDTO> {
		return invokeMethod("getFileInlineDiff", request)
	}

	override fun getFileMergeInlineDiff(request: com.ecwid.upsource.rpc.projects.FileMergeInlineDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileInlineDiffResponseDTO> {
		return invokeMethod("getFileMergeInlineDiff", request)
	}

	override fun getFileContent(request: com.ecwid.upsource.rpc.ids.FileInRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.fileordirectorycontent.FileContentResponseDTO> {
		return invokeMethod("getFileContent", request)
	}

	override fun getFilePsi(request: com.ecwid.upsource.rpc.fileordirectorycontent.FilePsiRequestDTO): RpcResponse<com.ecwid.upsource.rpc.fileordirectorycontent.FilePsiResponseDTO> {
		return invokeMethod("getFilePsi", request)
	}

	override fun getStubNavigationRange(request: com.ecwid.upsource.rpc.findusages.StubIdDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.NavigationTargetItemDTO> {
		return invokeMethod("getStubNavigationRange", request)
	}

	override fun getElementDescription(request: com.ecwid.upsource.rpc.findusages.PsiElementIdDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.TargetDescriptionDTO> {
		return invokeMethod("getElementDescription", request)
	}

	override fun getElementDocumentation(request: com.ecwid.upsource.rpc.findusages.PsiElementIdDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.ElementDocumentationDTO> {
		return invokeMethod("getElementDocumentation", request)
	}

	override fun findUsages(request: com.ecwid.upsource.rpc.findusages.PsiElementIdDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.FindUsagesResponseDTO> {
		return invokeMethod("findUsages", request)
	}

	override fun getUsagesDiff(request: com.ecwid.upsource.rpc.findusages.UsagesDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.UsagesDiffResponseDTO> {
		return invokeMethod("getUsagesDiff", request)
	}

	override fun findHierarchy(request: com.ecwid.upsource.rpc.findusages.PsiElementIdDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.FindHierarchyResultDTO> {
		return invokeMethod("findHierarchy", request)
	}

	override fun gotoFileByName(request: com.ecwid.upsource.rpc.findusages.GotoFileRequestDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.GotoFileResponseDTO> {
		return invokeMethod("gotoFileByName", request)
	}

	override fun textSearch(request: com.ecwid.upsource.rpc.findusages.TextSearchRequestDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.TextSearchResponseDTO> {
		return invokeMethod("textSearch", request)
	}

	override fun findBranches(request: com.ecwid.upsource.rpc.findusages.FindBranchRequestDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.FindBranchResponseDTO> {
		return invokeMethod("findBranches", request)
	}

	override fun getBranchDiff(request: com.ecwid.upsource.rpc.projects.BranchRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsDiffDTO> {
		return invokeMethod("getBranchDiff", request)
	}

	override fun getRevisionsDiff(request: com.ecwid.upsource.rpc.projects.RevisionsDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsDiffDTO> {
		return invokeMethod("getRevisionsDiff", request)
	}

	override fun getCompareInfo(request: com.ecwid.upsource.rpc.projects.CompareRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.CompareInfoDTO> {
		return invokeMethod("getCompareInfo", request)
	}

	override fun getCompareGraph(request: com.ecwid.upsource.rpc.projects.RevisionsDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.CompareGraphDTO> {
		return invokeMethod("getCompareGraph", request)
	}

	override fun getBranchInfo(request: com.ecwid.upsource.rpc.projects.BranchRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.BranchInfoDTO> {
		return invokeMethod("getBranchInfo", request)
	}

	override fun getBranchGraph(request: com.ecwid.upsource.rpc.projects.BranchRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.BranchGraphDTO> {
		return invokeMethod("getBranchGraph", request)
	}

	override fun getBranches(request: com.ecwid.upsource.rpc.projects.BranchesRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.BranchListDTO> {
		return invokeMethod("getBranches", request)
	}

	override fun findCommits(request: com.ecwid.upsource.rpc.projects.FindCommitsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FindCommitsResponseDTO> {
		return invokeMethod("findCommits", request)
	}

	override fun getProjectDiscussions(request: com.ecwid.upsource.rpc.projects.DiscussionsInProjectRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.DiscussionsInProjectDTO> {
		return invokeMethod("getProjectDiscussions", request)
	}

	override fun getFileDiscussions(request: com.ecwid.upsource.rpc.ids.FileInRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.projects.DiscussionsInFileDTO> {
		return invokeMethod("getFileDiscussions", request)
	}

	override fun getInlineDiscussionsInRevision(request: com.ecwid.upsource.rpc.ids.RevisionInProjectDTO): RpcResponse<com.ecwid.upsource.rpc.projects.DiscussionsInFilesDTO> {
		return invokeMethod("getInlineDiscussionsInRevision", request)
	}

	override fun createDiscussion(request: com.ecwid.upsource.rpc.projects.CreateDiscussionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.DiscussionInFileDTO> {
		return invokeMethod("createDiscussion", request)
	}

	override fun resolveDiscussion(request: com.ecwid.upsource.rpc.projects.ResolveDiscussionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("resolveDiscussion", request)
	}

	override fun getCurrentUserCanResolveDiscussion(request: com.ecwid.upsource.rpc.projects.DiscussionIdDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("getCurrentUserCanResolveDiscussion", request)
	}

	override fun addDiscussionLabel(request: com.ecwid.upsource.rpc.projects.UpdateDiscussionLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.LabelDTO> {
		return invokeMethod("addDiscussionLabel", request)
	}

	override fun addReviewLabel(request: com.ecwid.upsource.rpc.projects.UpdateReviewLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.UpdateReviewLabelResponseDTO> {
		return invokeMethod("addReviewLabel", request)
	}

	override fun removeDiscussionLabel(request: com.ecwid.upsource.rpc.projects.UpdateDiscussionLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("removeDiscussionLabel", request)
	}

	override fun removeReviewLabel(request: com.ecwid.upsource.rpc.projects.UpdateReviewLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.UpdateReviewLabelResponseDTO> {
		return invokeMethod("removeReviewLabel", request)
	}

	override fun starDiscussion(request: com.ecwid.upsource.rpc.projects.UpdateDiscussionFlagRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("starDiscussion", request)
	}

	override fun readDiscussion(request: com.ecwid.upsource.rpc.projects.UpdateDiscussionFlagRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("readDiscussion", request)
	}

	override fun addComment(request: com.ecwid.upsource.rpc.projects.AddCommentRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.CommentDTO> {
		return invokeMethod("addComment", request)
	}

	override fun updateComment(request: com.ecwid.upsource.rpc.projects.UpdateCommentRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.UpdateCommentResponseDTO> {
		return invokeMethod("updateComment", request)
	}

	override fun removeComment(request: com.ecwid.upsource.rpc.projects.RemoveCommentRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RemoveCommentResponseDTO> {
		return invokeMethod("removeComment", request)
	}

	override fun updateTaskList(request: com.ecwid.upsource.rpc.projects.UpdateTaskListRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.UpdateCommentResponseDTO> {
		return invokeMethod("updateTaskList", request)
	}

	override fun toggleReaction(request: com.ecwid.upsource.rpc.projects.ToggleReactionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("toggleReaction", request)
	}

	override fun getFeed(request: com.ecwid.upsource.rpc.projects.FeedRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FeedDTO> {
		return invokeMethod("getFeed", request)
	}

	override fun getRevisionDiscussions(request: com.ecwid.upsource.rpc.ids.RevisionInProjectDTO): RpcResponse<com.ecwid.upsource.rpc.projects.DiscussionsInRevisionDTO> {
		return invokeMethod("getRevisionDiscussions", request)
	}

	override fun getRevisionReviewInfo(request: com.ecwid.upsource.rpc.projects.RevisionListDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionReviewInfoListDTO> {
		return invokeMethod("getRevisionReviewInfo", request)
	}

	override fun getSuggestedReviewsForRevisions(request: com.ecwid.upsource.rpc.projects.RevisionListDTO): RpcResponse<com.ecwid.upsource.rpc.projects.SuggestedReviewListDTO> {
		return invokeMethod("getSuggestedReviewsForRevisions", request)
	}

	override fun getSuggestedReviewForGhosts(request: com.ecwid.upsource.rpc.projects.UncommittedRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewSuggestDTO> {
		return invokeMethod("getSuggestedReviewForGhosts", request)
	}

	override fun getRevisionDiscussionCounters(request: com.ecwid.upsource.rpc.projects.RevisionDiscussionCountersRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionDiscussionCountersListDTO> {
		return invokeMethod("getRevisionDiscussionCounters", request)
	}

	override fun getRevisionBuildStatus(request: com.ecwid.upsource.rpc.projects.RevisionListDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionBuildStatusListDTO> {
		return invokeMethod("getRevisionBuildStatus", request)
	}

	override fun getRevisionsOwnershipSummary(request: com.ecwid.upsource.rpc.projects.RevisionListDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsOwnershipSummaryDTO> {
		return invokeMethod("getRevisionsOwnershipSummary", request)
	}

	override fun getRevisionsExternalInspectionsDiff(request: com.ecwid.upsource.rpc.projects.RevisionListDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsExternalInspectionsDiffResponseDTO> {
		return invokeMethod("getRevisionsExternalInspectionsDiff", request)
	}

	override fun getUsersForMention(request: com.ecwid.upsource.rpc.users.UsersForMentionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UsersListDTO> {
		return invokeMethod("getUsersForMention", request)
	}

	override fun getUsersForReview(request: com.ecwid.upsource.rpc.users.UsersForReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UsersForReviewDTO> {
		return invokeMethod("getUsersForReview", request)
	}

	override fun getProjectUserGroups(request: com.ecwid.upsource.rpc.users.ProjectUserGroupsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UserGroupsListDTO> {
		return invokeMethod("getProjectUserGroups", request)
	}

	override fun getUserGroupsByIds(request: com.ecwid.upsource.rpc.users.UserGroupsIdsListDTO): RpcResponse<com.ecwid.upsource.rpc.users.UserGroupsListDTO> {
		return invokeMethod("getUserGroupsByIds", request)
	}

	override fun findUsers(request: com.ecwid.upsource.rpc.users.FindUsersRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UserInfoResponseDTO> {
		return invokeMethod("findUsers", request)
	}

	override fun getLabels(request: com.ecwid.upsource.rpc.projects.LabelsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.LabelsListDTO> {
		return invokeMethod("getLabels", request)
	}

	override fun getReviewLabels(request: com.ecwid.upsource.rpc.projects.LabelsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.LabelsListDTO> {
		return invokeMethod("getReviewLabels", request)
	}

	override fun getReviews(request: com.ecwid.upsource.rpc.projects.ReviewsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewListDTO> {
		return invokeMethod("getReviews", request)
	}

	override fun createReview(request: com.ecwid.upsource.rpc.projects.CreateReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewDescriptorDTO> {
		return invokeMethod("createReview", request)
	}

	override fun closeReview(request: com.ecwid.upsource.rpc.projects.CloseReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.CloseReviewResponseDTO> {
		return invokeMethod("closeReview", request)
	}

	override fun renameReview(request: com.ecwid.upsource.rpc.projects.RenameReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RenameReviewResponseDTO> {
		return invokeMethod("renameReview", request)
	}

	override fun editReviewDescription(request: com.ecwid.upsource.rpc.projects.EditReviewDescriptionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("editReviewDescription", request)
	}

	override fun getReviewDetails(request: com.ecwid.upsource.rpc.ids.ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewDescriptorDTO> {
		return invokeMethod("getReviewDetails", request)
	}

	override fun getReviewOwnershipSummary(request: com.ecwid.upsource.rpc.ids.ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewOwnershipSummaryDTO> {
		return invokeMethod("getReviewOwnershipSummary", request)
	}

	override fun getReviewProgress(request: com.ecwid.upsource.rpc.ids.ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewProgressDTO> {
		return invokeMethod("getReviewProgress", request)
	}

	override fun getReviewInspectionsDiff(request: com.ecwid.upsource.rpc.projects.ReviewInspectionsDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.fileordirectorycontent.InspectionsDiffDTO> {
		return invokeMethod("getReviewInspectionsDiff", request)
	}

	override fun addRevisionToReview(request: com.ecwid.upsource.rpc.projects.RevisionsInReviewDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("addRevisionToReview", request)
	}

	override fun startBranchTracking(request: com.ecwid.upsource.rpc.projects.StartBranchTrackingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("startBranchTracking", request)
	}

	override fun stopBranchTracking(request: com.ecwid.upsource.rpc.projects.StopBranchTrackingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("stopBranchTracking", request)
	}

	override fun squashReviewRevisions(request: com.ecwid.upsource.rpc.ids.ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("squashReviewRevisions", request)
	}

	override fun removeRevisionFromReview(request: com.ecwid.upsource.rpc.projects.RevisionsInReviewDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("removeRevisionFromReview", request)
	}

	override fun getRevisionsInReview(request: com.ecwid.upsource.rpc.ids.ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsInReviewResponseDTO> {
		return invokeMethod("getRevisionsInReview", request)
	}

	override fun getSuggestedRevisionsForReview(request: com.ecwid.upsource.rpc.ids.ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.SuggestedRevisionListDTO> {
		return invokeMethod("getSuggestedRevisionsForReview", request)
	}

	override fun addParticipantToReview(request: com.ecwid.upsource.rpc.projects.ParticipantInReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("addParticipantToReview", request)
	}

	override fun addGroupToReview(request: com.ecwid.upsource.rpc.projects.AddGroupToReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.AddGroupToReviewResponseDTO> {
		return invokeMethod("addGroupToReview", request)
	}

	override fun updateParticipantInReview(request: com.ecwid.upsource.rpc.projects.UpdateParticipantInReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.UpdateParticipantInReviewResponseDTO> {
		return invokeMethod("updateParticipantInReview", request)
	}

	override fun removeParticipantFromReview(request: com.ecwid.upsource.rpc.projects.ParticipantInReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("removeParticipantFromReview", request)
	}

	override fun toggleReviewMuted(request: com.ecwid.upsource.rpc.projects.ToggleReviewMutedRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("toggleReviewMuted", request)
	}

	override fun setReviewDeadline(request: com.ecwid.upsource.rpc.projects.ReviewDeadlineRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("setReviewDeadline", request)
	}

	override fun setReviewTargetBranch(request: com.ecwid.upsource.rpc.projects.ReviewTargetBranchDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("setReviewTargetBranch", request)
	}

	override fun getReviewSummaryChanges(request: com.ecwid.upsource.rpc.projects.ReviewSummaryChangesRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewSummaryChangesResponseDTO> {
		return invokeMethod("getReviewSummaryChanges", request)
	}

	override fun getFileInReviewSummaryInlineChanges(request: com.ecwid.upsource.rpc.projects.FileInReviewDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileInlineDiffResponseDTO> {
		return invokeMethod("getFileInReviewSummaryInlineChanges", request)
	}

	override fun getFileInReviewSummaryDiff(request: com.ecwid.upsource.rpc.projects.FileInReviewDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileDiffResponseDTO> {
		return invokeMethod("getFileInReviewSummaryDiff", request)
	}

	override fun setFileInReviewReadStatus(request: com.ecwid.upsource.rpc.projects.FileInReviewReadStatusRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("setFileInReviewReadStatus", request)
	}

	override fun getReviewSummaryDiscussions(request: com.ecwid.upsource.rpc.projects.ReviewSummaryDiscussionsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.DiscussionsInFilesDTO> {
		return invokeMethod("getReviewSummaryDiscussions", request)
	}

	override fun removeReview(request: com.ecwid.upsource.rpc.ids.ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("removeReview", request)
	}

	override fun getMatchingRevisionsForStacktrace(request: com.ecwid.upsource.rpc.projects.StacktraceDTO): RpcResponse<com.ecwid.upsource.rpc.projects.MatchingRevisionsResponseDTO> {
		return invokeMethod("getMatchingRevisionsForStacktrace", request)
	}

	override fun getStacktraceInContextOfRevision(request: com.ecwid.upsource.rpc.projects.StacktraceDTO): RpcResponse<com.ecwid.upsource.rpc.projects.StacktracePositionsDTO> {
		return invokeMethod("getStacktraceInContextOfRevision", request)
	}

	override fun getCurrentUser(request: com.ecwid.upsource.rpc.ids.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.users.CurrentUserResponseDTO> {
		return invokeMethod("getCurrentUser", request)
	}

	override fun getCurrentUserCanCloseReview(request: com.ecwid.upsource.rpc.ids.ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("getCurrentUserCanCloseReview", request)
	}

	override fun getCurrentUserCanDeleteReview(request: com.ecwid.upsource.rpc.ids.ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("getCurrentUserCanDeleteReview", request)
	}

	override fun getUserInfo(request: com.ecwid.upsource.rpc.users.UserInfoRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UserInfoResponseDTO> {
		return invokeMethod("getUserInfo", request)
	}

	override fun getUsersPresenceInfo(request: com.ecwid.upsource.rpc.users.UserInfoRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UsersPresenceInfoResponseDTO> {
		return invokeMethod("getUsersPresenceInfo", request)
	}

	override fun bindVcsUsername(request: com.ecwid.upsource.rpc.users.BindVcsUsernameRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("bindVcsUsername", request)
	}

	override fun getUserProjects(request: com.ecwid.upsource.rpc.users.UserProjectsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UserProjectsResponseDTO> {
		return invokeMethod("getUserProjects", request)
	}

	override fun setUserAbsence(request: com.ecwid.upsource.rpc.users.UserAbsenceRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("setUserAbsence", request)
	}

	override fun getUserSetting(request: com.ecwid.upsource.rpc.misc.GetSettingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.misc.GetSettingResponseDTO> {
		return invokeMethod("getUserSetting", request)
	}

	override fun setUserSetting(request: com.ecwid.upsource.rpc.misc.SetSettingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("setUserSetting", request)
	}

	override fun getClusterSetting(request: com.ecwid.upsource.rpc.misc.GetSettingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.misc.GetSettingResponseDTO> {
		return invokeMethod("getClusterSetting", request)
	}

	override fun setClusterSetting(request: com.ecwid.upsource.rpc.misc.SetSettingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("setClusterSetting", request)
	}

	override fun setMotto(request: com.ecwid.upsource.rpc.misc.SetMottoRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("setMotto", request)
	}

	override fun getProjectSetting(request: com.ecwid.upsource.rpc.misc.GetProjectSettingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.misc.GetSettingResponseDTO> {
		return invokeMethod("getProjectSetting", request)
	}

	override fun setProjectSetting(request: com.ecwid.upsource.rpc.misc.SetProjectSettingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("setProjectSetting", request)
	}

	override fun setProjectWebhooks(request: com.ecwid.upsource.rpc.misc.SetProjectWebhooksRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("setProjectWebhooks", request)
	}

	override fun createProject(request: com.ecwid.upsource.rpc.projects.CreateProjectRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("createProject", request)
	}

	override fun loadProject(request: com.ecwid.upsource.rpc.ids.ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ProjectSettingsDTO> {
		return invokeMethod("loadProject", request)
	}

	override fun editProject(request: com.ecwid.upsource.rpc.projects.EditProjectRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("editProject", request)
	}

	override fun deleteProject(request: com.ecwid.upsource.rpc.ids.ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("deleteProject", request)
	}

	override fun resetProject(request: com.ecwid.upsource.rpc.ids.ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("resetProject", request)
	}

	override fun getProjectConfigurationParameters(request: com.ecwid.upsource.rpc.ids.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.projects.ProjectConfigurationResponseDTO> {
		return invokeMethod("getProjectConfigurationParameters", request)
	}

	override fun getVcsHostingServices(request: com.ecwid.upsource.rpc.projects.VcsHostingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.VcsHostingResponseDTO> {
		return invokeMethod("getVcsHostingServices", request)
	}

	override fun createOrEditLabel(request: com.ecwid.upsource.rpc.projects.EditLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.LabelDTO> {
		return invokeMethod("createOrEditLabel", request)
	}

	override fun createOrEditReviewLabel(request: com.ecwid.upsource.rpc.projects.EditLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.LabelDTO> {
		return invokeMethod("createOrEditReviewLabel", request)
	}

	override fun hidePredefinedLabels(request: com.ecwid.upsource.rpc.projects.HidePredefinedLabelsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("hidePredefinedLabels", request)
	}

	override fun hidePredefinedReviewLabels(request: com.ecwid.upsource.rpc.projects.HidePredefinedLabelsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("hidePredefinedReviewLabels", request)
	}

	override fun deleteLabel(request: com.ecwid.upsource.rpc.projects.EditLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("deleteLabel", request)
	}

	override fun deleteReviewLabel(request: com.ecwid.upsource.rpc.projects.EditLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("deleteReviewLabel", request)
	}

	override fun mergeLabels(request: com.ecwid.upsource.rpc.projects.EditLabelsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.LabelDTO> {
		return invokeMethod("mergeLabels", request)
	}

	override fun testVcsConnection(request: com.ecwid.upsource.rpc.projects.TestConnectionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.TestConnectionResponseDTO> {
		return invokeMethod("testVcsConnection", request)
	}

	override fun testPOP3Mailbox(request: com.ecwid.upsource.rpc.misc.TestPOP3MailboxRequestDTO): RpcResponse<com.ecwid.upsource.rpc.misc.TestPOP3MailboxResponseDTO> {
		return invokeMethod("testPOP3Mailbox", request)
	}

	override fun getReadOnlyMode(request: com.ecwid.upsource.rpc.ids.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.misc.ReadOnlyModeDTO> {
		return invokeMethod("getReadOnlyMode", request)
	}

	override fun setReadOnlyMode(request: com.ecwid.upsource.rpc.misc.ReadOnlyModeDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("setReadOnlyMode", request)
	}

	override fun getEmailBounces(request: com.ecwid.upsource.rpc.ids.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.misc.EmailBouncesResponseDTO> {
		return invokeMethod("getEmailBounces", request)
	}

	override fun resetEmailBounces(request: com.ecwid.upsource.rpc.ids.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("resetEmailBounces", request)
	}

	override fun getAllRoles(request: com.ecwid.upsource.rpc.ids.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.projects.AllRolesResponseDTO> {
		return invokeMethod("getAllRoles", request)
	}

	override fun getUsersRoles(request: com.ecwid.upsource.rpc.projects.UsersRolesRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.UsersRolesResponseDTO> {
		return invokeMethod("getUsersRoles", request)
	}

	override fun addUserRole(request: com.ecwid.upsource.rpc.projects.AddRoleRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("addUserRole", request)
	}

	override fun deleteUserRole(request: com.ecwid.upsource.rpc.projects.DeleteRoleRequestDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("deleteUserRole", request)
	}

	override fun inviteUser(request: com.ecwid.upsource.rpc.projects.InviteUserRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.InviteUserResponseDTO> {
		return invokeMethod("inviteUser", request)
	}

	override fun exportData(request: com.ecwid.upsource.rpc.ids.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.misc.ExportDataResponseDTO> {
		return invokeMethod("exportData", request)
	}

	override fun getProjectActivity(request: com.ecwid.upsource.rpc.analytics.ProjectActivityRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ProjectActivityDTO> {
		return invokeMethod("getProjectActivity", request)
	}

	override fun getContributorsDistribution(request: com.ecwid.upsource.rpc.analytics.ContributorsDistributionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ContributorsDistributionDTO> {
		return invokeMethod("getContributorsDistribution", request)
	}

	override fun getResponsibilityDistribution(request: com.ecwid.upsource.rpc.analytics.ResponsibilityDistributionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ResponsibilityDistributionDTO> {
		return invokeMethod("getResponsibilityDistribution", request)
	}

	override fun getProjectCommitters(request: com.ecwid.upsource.rpc.ids.ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ProjectCommittersDTO> {
		return invokeMethod("getProjectCommitters", request)
	}

	override fun getUserActivity(request: com.ecwid.upsource.rpc.analytics.UserActivityRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.UserActivityDTO> {
		return invokeMethod("getUserActivity", request)
	}

	override fun getModulesDistribution(request: com.ecwid.upsource.rpc.analytics.ModulesDistributionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ModulesDistributionDTO> {
		return invokeMethod("getModulesDistribution", request)
	}

	override fun getCommitsSummary(request: com.ecwid.upsource.rpc.analytics.CommitsSummaryRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.CommitsSummaryDTO> {
		return invokeMethod("getCommitsSummary", request)
	}

	override fun getCommitsDetails(request: com.ecwid.upsource.rpc.analytics.CommitsDetailsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.CommitsDetailsDTO> {
		return invokeMethod("getCommitsDetails", request)
	}

	override fun getFileHistoryChart(request: com.ecwid.upsource.rpc.analytics.FileHistoryChartRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.FileHistoryChartDTO> {
		return invokeMethod("getFileHistoryChart", request)
	}

	override fun getProjectTreeMap(request: com.ecwid.upsource.rpc.analytics.ProjectTreeMapRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ProjectTreeMapDTO> {
		return invokeMethod("getProjectTreeMap", request)
	}

	override fun getProjectPulse(request: com.ecwid.upsource.rpc.analytics.ProjectPulseRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.PulseResponseDTO> {
		return invokeMethod("getProjectPulse", request)
	}

	override fun getUserPulse(request: com.ecwid.upsource.rpc.analytics.UserPulseRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.PulseResponseDTO> {
		return invokeMethod("getUserPulse", request)
	}

	override fun getReviewStatistics(request: com.ecwid.upsource.rpc.analytics.ReviewStatisticsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ReviewStatisticsDTO> {
		return invokeMethod("getReviewStatistics", request)
	}

	override fun getReviewCoverage(request: com.ecwid.upsource.rpc.analytics.ReviewCoverageRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ReviewCoverageDTO> {
		return invokeMethod("getReviewCoverage", request)
	}

	override fun getReviewTimeStatistics(request: com.ecwid.upsource.rpc.analytics.ReviewTimeStatisticsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ReviewTimeStatisticsDTO> {
		return invokeMethod("getReviewTimeStatistics", request)
	}

	override fun getReviewersGraph(request: com.ecwid.upsource.rpc.analytics.ReviewersGraphRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ReviewersGraphDTO> {
		return invokeMethod("getReviewersGraph", request)
	}

	override fun updateUserTimezone(request: com.ecwid.upsource.rpc.misc.UpdateUserTimezoneDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("updateUserTimezone", request)
	}

	override fun updateAchievementsLastSeen(request: com.ecwid.upsource.rpc.misc.UserActionNotificationDTO): RpcResponse<com.ecwid.upsource.rpc.ids.VoidMessage> {
		return invokeMethod("updateAchievementsLastSeen", request)
	}

	override fun getUnlockedUserAchievements(request: com.ecwid.upsource.rpc.misc.UserAchievementsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.misc.AchievementsListDTO> {
		return invokeMethod("getUnlockedUserAchievements", request)
	}

	override fun getUnreadUnlockedUserAchievementsCount(request: com.ecwid.upsource.rpc.ids.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.misc.UserAchievementsCountDTO> {
		return invokeMethod("getUnreadUnlockedUserAchievementsCount", request)
	}

	override fun getUserAchievements(request: com.ecwid.upsource.rpc.misc.UserAchievementsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.misc.AchievementsListDTO> {
		return invokeMethod("getUserAchievements", request)
	}

	override fun getAvailableIssueTrackerProviders(request: com.ecwid.upsource.rpc.ids.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.issuetrackers.IssueTrackerProvidersListDTO> {
		return invokeMethod("getAvailableIssueTrackerProviders", request)
	}

	override fun getIssueInfo(request: com.ecwid.upsource.rpc.issuetrackers.IssueInfoRequestDTO): RpcResponse<com.ecwid.upsource.rpc.issuetrackers.IssueInfoDTO> {
		return invokeMethod("getIssueInfo", request)
	}

	override fun createIssueFromDiscussion(request: com.ecwid.upsource.rpc.issuetrackers.CreateIssueFromDiscussionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.issuetrackers.IssueIdDTO> {
		return invokeMethod("createIssueFromDiscussion", request)
	}

	override fun createIssueFromReview(request: com.ecwid.upsource.rpc.issuetrackers.CreateIssueFromReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.issuetrackers.IssueIdDTO> {
		return invokeMethod("createIssueFromReview", request)
	}
}
