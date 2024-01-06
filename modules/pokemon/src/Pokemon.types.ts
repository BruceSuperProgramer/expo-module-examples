export type ChangeEventPayload = {
  value: string;
};

type Data = Array<{
  name: string;
  category: string;
  city: string;
  state: string;
  id: number;
  isFeatured: boolean;
  isFavorite: boolean;
  park: string;
  coordinates: {
    longitude: number;
    latitude: number;
  };
  description: string;
  imageName: string;
}>;

export type PokemonViewProps = {
  name: string;
  listData: Data;
};
