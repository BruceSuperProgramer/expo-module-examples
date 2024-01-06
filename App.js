import { StatusBar } from "expo-status-bar";
import { useCallback, useState } from "react";
import { Button, SafeAreaView, StyleSheet } from "react-native";
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

      <PokemonView
        style={{ flex: 1, backgroundColor: "purple" }}
        listData={listData}
      />
      <Button onPress={deleteLastItem} title={"Delete"}></Button>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    flexDirection: "row"
  }
});
