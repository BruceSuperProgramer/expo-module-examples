import { StatusBar } from "expo-status-bar";
import { useCallback, useState } from "react";
import { Button, StyleSheet } from "react-native";
import { SafeAreaView } from "react-native-safe-area-context";
import landmarkData from "./assets/landmarkData";
import { PokemonModule, PokemonView } from "./modules/pokemon";

export default function App() {
  const [listData, setListData] = useState(landmarkData);

  const deleteLastItem = useCallback(() => {
    PokemonModule.deleteLastItem();
  }, []);

  return (
    <SafeAreaView style={styles.container}>
      <StatusBar style="auto" />
      <Button onPress={deleteLastItem} title={"Delete"} />
      <PokemonView style={styles.pokemonView} listData={listData} />
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff"
  },
  pokemonView: {
    flex: 1
  }
});
