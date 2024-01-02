import { requireNativeViewManager } from 'expo-modules-core';
import * as React from 'react';

import { PokemonViewProps } from './Pokemon.types';

const NativeView: React.ComponentType<PokemonViewProps> =
  requireNativeViewManager('Pokemon');

export default function PokemonView(props: PokemonViewProps) {
  return <NativeView {...props} />;
}
