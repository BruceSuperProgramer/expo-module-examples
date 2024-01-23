import { requireNativeViewManager } from 'expo-modules-core';
import * as React from 'react';

import { ExpoVideoViewProps } from './ExpoVideo.types';

const NativeView: React.ComponentType<ExpoVideoViewProps> =
  requireNativeViewManager('ExpoVideo');

export default function ExpoVideoView(props: ExpoVideoViewProps) {
  return <NativeView {...props} />;
}
