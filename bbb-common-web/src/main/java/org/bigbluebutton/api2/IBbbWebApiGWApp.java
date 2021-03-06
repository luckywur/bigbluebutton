package org.bigbluebutton.api2;


import org.bigbluebutton.api.messaging.converters.messages.*;
import org.bigbluebutton.presentation.messages.IDocConversionMsg;

import java.util.Map;

public interface IBbbWebApiGWApp {
  void send(String channel, String message);
  void createMeeting(String meetingID, String externalMeetingID,
                     String parentMeetingID, String meetingName, Boolean recorded,
                     String voiceBridge, Integer duration, Boolean autoStartRecording,
                     Boolean allowStartStopRecording, Boolean webcamsOnlyForModerator,
                     String moderatorPass, String viewerPass, Long createTime,
                     String createDate, Boolean isBreakout, Integer sequence, Map<String, String> metadata,
                     String guestPolicy, String welcomeMsgTemplate, String welcomeMsg, String modOnlyMessage,
                     String dialNumber, Integer maxUsers,
                     Integer maxInactivityTimeoutMinutes, Integer warnMinutesBeforeMax,
                     Integer meetingExpireIfNoUserJoinedInMinutes,
                     Integer meetingExpireWhenLastUserLeftInMinutes,
                     Boolean muteOnStart);

  void registerUser(String meetingID, String internalUserId, String fullname, String role,
                    String externUserID, String authToken, String avatarURL,
                    Boolean guest, Boolean authed, String guestStatus);
  void ejectDuplicateUser(String meetingID, String internalUserId, String fullname,
                    String externUserID);

  void destroyMeeting(DestroyMeetingMessage msg);
  void endMeeting(EndMeetingMessage msg);
  void sendKeepAlive(String system, Long timestamp);
  void publishRecording(PublishRecordingMessage msg);
  void unpublishRecording(UnpublishRecordingMessage msg);
  void deleteRecording(DeleteRecordingMessage msg);
  void sendDocConversionMsg(IDocConversionMsg msg);
}
