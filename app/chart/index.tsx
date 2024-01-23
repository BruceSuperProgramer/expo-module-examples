import { StyledComponent } from "nativewind";
import { useMemo } from "react";
import { Platform, View } from "react-native";
import ExpoRadialChartView from "../../modules/expo-radial-chart/src/ExpoRadialChartView";
import { ANDROID_DATA, IOS_DATA } from "./constants";

const ChartScreen = () => {
  const DATA = useMemo(() => {
    if (Platform.OS == "android") return ANDROID_DATA;
    return IOS_DATA;
  }, []);
  return (
    <StyledComponent component={View} className="flex-1">
      <ExpoRadialChartView style={{ flex: 1 }} data={DATA} />
    </StyledComponent>
  );
};

export default ChartScreen;
