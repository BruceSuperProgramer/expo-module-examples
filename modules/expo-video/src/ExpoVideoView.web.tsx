import * as React from 'react';

import { ExpoVideoViewProps } from './ExpoVideo.types';

export default function ExpoVideoView(props: ExpoVideoViewProps) {
  return (
    <div>
      <span>{props.name}</span>
    </div>
  );
}
