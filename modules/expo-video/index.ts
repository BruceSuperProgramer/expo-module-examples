import { NativeModulesProxy, EventEmitter, Subscription } from 'expo-modules-core';

// Import the native module. On web, it will be resolved to ExpoVideo.web.ts
// and on native platforms to ExpoVideo.ts
import ExpoVideoModule from './src/ExpoVideoModule';
import ExpoVideoView from './src/ExpoVideoView';
import { ChangeEventPayload, ExpoVideoViewProps } from './src/ExpoVideo.types';

// Get the native constant value.
export const PI = ExpoVideoModule.PI;

export function hello(): string {
  return ExpoVideoModule.hello();
}

export async function setValueAsync(value: string) {
  return await ExpoVideoModule.setValueAsync(value);
}

const emitter = new EventEmitter(ExpoVideoModule ?? NativeModulesProxy.ExpoVideo);

export function addChangeListener(listener: (event: ChangeEventPayload) => void): Subscription {
  return emitter.addListener<ChangeEventPayload>('onChange', listener);
}

export { ExpoVideoView, ExpoVideoViewProps, ChangeEventPayload };
