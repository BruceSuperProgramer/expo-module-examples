import * as React from 'react';

import { PokemonViewProps } from './Pokemon.types';

export default function PokemonView(props: PokemonViewProps) {
  return (
    <div>
      <span>{props.name}</span>
    </div>
  );
}
