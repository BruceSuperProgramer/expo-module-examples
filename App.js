import { StatusBar } from "expo-status-bar";
import { useCallback, useState } from "react";
import { SafeAreaView, StyleSheet } from "react-native";
import landmarkData from "./assets/landmarkData";
import { ExpoRadialChartView } from "./modules/expo-radial-chart";
import { PokemonModule } from "./modules/pokemon";

export default function App() {
  const [listData, setListData] = useState(landmarkData);

  const deleteLastItem = useCallback(() => {
    PokemonModule.deleteLastItem();
  }, []);

  return (
    <SafeAreaView style={styles.container}>
      <StatusBar style="auto" />

      {/* <PokemonView
        style={{ flex: 1, backgroundColor: "purple" }}
        listData={listData}
      />
      <Button onPress={deleteLastItem} title={"Delete"}></Button> */}

      <ExpoRadialChartView
        style={styles.container}
        data={[
          {
            color: "#ff0000",
            percentage: 0.5
          },
          {
            color: "#00ff00",
            percentage: 0.2
          },
          {
            color: "#0000ff",
            percentage: 0.3
          }
        ]}
      />
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
