import { StyledComponent } from "nativewind";
import { View } from "react-native";
import ExpoRadialChartView from "../../modules/expo-radial-chart/src/ExpoRadialChartView";

const DATA = [
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
];

const ChartScreen = () => {
  return (
    <StyledComponent component={View} className="flex-1">
      <ExpoRadialChartView style={{ flex: 1 }} data={DATA} />
    </StyledComponent>
  );
};

export default ChartScreen;
