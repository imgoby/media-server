package com.kaltura.media.server;

import com.kaltura.client.KalturaApiException;
import com.kaltura.client.enums.KalturaMediaServerIndex;
import com.kaltura.client.types.KalturaLiveStreamEntry;

public interface ILiveStreamManager extends IManager {

	public void onPublish(KalturaLiveStreamEntry liveStreamEntry, KalturaMediaServerIndex serverIndex);
	
	public void onUnPublish(KalturaLiveStreamEntry liveStreamEntry);
	
	public void onDisconnect(String entryId);

	public KalturaLiveStreamEntry get(String entryId);

	public KalturaLiveStreamEntry get(String entryId, int partnerId) throws KalturaApiException;
	
	public Integer getDvrWindow(KalturaLiveStreamEntry liveStreamEntry);

	public boolean splitRecordingNow(String entryId);
}