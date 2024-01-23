import { useCallback, useState } from "react";
import { Button, StyleSheet, View } from "react-native";
import landmarkData from "../../assets/landmarkData";
import { PokemonModule, PokemonView } from "../../modules/pokemon";

export default function NativelistScreen() {
  const [listData, setListData] = useState(landmarkData);

  const deleteLastItem = useCallback(() => {
    PokemonModule.deleteLastItem();
  }, []);

  return (
    <View style={styles.container}>
      <PokemonView style={styles.pokemonView} listData={listData} />
      <Button onPress={deleteLastItem} title={"Delete"} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1
  },
  pokemonView: {
    flex: 1
  }
});
